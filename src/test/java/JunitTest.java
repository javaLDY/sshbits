import com.shinowit.dao.mapper.StuinfoMapper;
import com.shinowit.entity.Stuinfo;
import com.shinowit.entity.StuinfoCriteria;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/12/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:application-context.xml"})
public class JunitTest extends AbstractJUnit4SpringContextTests {

    @Resource
    private StuinfoMapper stuinfodao;

    @Test
    public void test(){
        Stuinfo stuinfo = new Stuinfo();
        stuinfo.setStuname("test");
        stuinfo.setStucode("008");
        int a = stuinfodao.insert(stuinfo);
        System.out.println(a);
    }
    @Test
    public void update(){
        Stuinfo stuinfo = new Stuinfo();
        stuinfo.setStuid(20);
        stuinfo.setStucode("456");
        stuinfo.setStuname("孙超");
        int a = stuinfodao.updateByPrimaryKey(stuinfo);
        Assert.assertTrue(a==1);
    }
    @Test
    public void delete(){
        Stuinfo stuinfo = new Stuinfo();
        int a = stuinfodao.deleteByPrimaryKey(1);
        Assert.assertTrue(a==1);
    }
    @Test
    public void delete1(){
        Stuinfo stuinfo = new Stuinfo();
        StuinfoCriteria criteria = new StuinfoCriteria();
        StuinfoCriteria.Criteria tiaojian = criteria.createCriteria();
        tiaojian.andStunameEqualTo("孙超");
        int a = stuinfodao.deleteByExample(criteria);
        Assert.assertTrue(a==1);
    }
    @Test
    public void select(){
        Stuinfo stuinfo = stuinfodao.selectByPrimaryKey(21);
        System.out.println("学号:"+stuinfo.getStucode()+"姓名:"+stuinfo.getStuname()+"性别:"+stuinfo.getSexcode());
    }
    @Test
    public void select1(){
        StuinfoCriteria criteria = new StuinfoCriteria();
        StuinfoCriteria.Criteria tj = criteria.createCriteria();
        tj.andStuidIsNotNull();
        List<Stuinfo> stuinfolist = stuinfodao.selectByExample(criteria);
        for(Stuinfo stuinfo: stuinfolist){
            System.out.println("学号:"+stuinfo.getStucode()+"姓名:"+stuinfo.getStuname()+"性别:"+stuinfo.getSexcode());
        }
    }
    @Test
    public void select2(){
        List<Stuinfo> stuinfolist = stuinfodao.pagelist(0,1);
        for(Stuinfo stuinfo: stuinfolist){
            System.out.println("学号:"+stuinfo.getStucode()+"姓名:"+stuinfo.getStuname()+"性别:"+stuinfo.getSexcode());
        }
    }

}
