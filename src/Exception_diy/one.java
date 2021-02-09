package Exception_diy;

class Hero{
    String name;
    float hp;
    Hero(String name,float hp){this.name = name;this.hp=hp;}

    public void attack(Hero h) throws HeroIsDeadException
    {
        if(h.hp == 0)
            throw new HeroIsDeadException(h.name + "已经死了，别鞭尸了"); //使用throw而非throws抛出异常
    }

    class HeroIsDeadException extends Exception{
        public HeroIsDeadException() { } // 默认构造，信息更少，但是更方便

        public HeroIsDeadException(String msg) // 有参构造，导入异常原因，分析异常更方便
        {
            super(msg); // 可以使用getMessage()函数来获取具体异常信息
        }
    }
}

public class one {
    public static void main(String[] args)
    {
        Hero garen = new Hero("盖伦",600);
        Hero teemo = new Hero("提莫",0);
        try{
            garen.attack(teemo);
        }catch (Hero.HeroIsDeadException e){
            System.out.println("异常的具体原因：" + e.getMessage());
            e.printStackTrace();
        }
    }
}
