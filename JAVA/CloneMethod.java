
package JAVA;
/*===============================================================================================================
                                               cloning mehtod tech us a good thing in overriding
we can chnage the acces modifer of override method in sub class but in a order: what is that order
order is: aap bnd chees ko khol skte ho over ride krke but khud se bnd nhi kr skte
parent mai protected ya default hai aap use direct public kr skte hai sub class mai 
but public ko private,protexted,default bhiiii
Order is: default->protected->public
we can change defaule->protected
              default->public
              protected->public
              reverse order in not allow and private is not included bcz(private method can not be override
   ================================================================================================================*/

public class CloneMethod implements Cloneable{
    int i;
    int j;
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args)throws CloneNotSupportedException {
        CloneMethod obj = new CloneMethod();
        obj.i=2;
        obj.j=5;
        
        //print obj first
        System.out.println(obj.i+","+obj.j);
        
        
        // cloning the obj now
        
        CloneMethod objc = (CloneMethod)obj.clone();
        //lets change value of obj
        obj.i=15;
        System.out.println(obj.i+","+obj.j);
        
        
        System.out.println(objc.i+","+objc.j);
        
    }
}
