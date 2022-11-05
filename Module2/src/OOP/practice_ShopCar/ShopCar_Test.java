package OOP.practice_ShopCar;

import java.util.Scanner;

public class ShopCar_Test {
    public static void main(String[] args) {
        Goods[] shopCar = new Goods[100];
        while(true){
            System.out.println("请选择如下命令进行操作:");
            System.out.println("添加商品到购物车:add");
            System.out.println("查询商品到购物车:query");
            System.out.println("修改商品到购物车:update");
            System.out.println("结算商品到购物车:pay");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入指令:");
            String command = sc.next(); //接收命令
            switch (command){
                case "add":
                    addGoods(shopCar, sc);
                    break;
                case "query":
                    queryGoods(shopCar);
                    break;
                case "update":
                    updateGoods(shopCar, sc);
                    break;
                case "pay":
                    payGoods(shopCar);
                    break;
                default:
                    System.out.println("没有该功能");
                    break;
            }
        }
    }

    public static void addGoods(Goods[] shopCar,Scanner sc){
        System.out.println("请输入购买商品的编号:");
        int id = sc.nextInt();
        System.out.println("请输入购买商品的名称:");
        String name = sc.next();
        System.out.println("请输入购买商品的价格:");
        double price = sc.nextDouble();
        System.out.println("请输入购买商品的购买数量:");
        int buynumber = sc.nextInt();
        //创建对象
        Goods a = new Goods(id,name,price,buynumber);
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null){
                shopCar[i] = a;
                break;//找到后跳出循环
            }
        }
        System.out.println("你的商品"+a.getName()+"已添加入购物车!");
    }

    public static void queryGoods(Goods[] shopCar){
        System.out.println("=================查询购物车信息如下=================");
        System.out.println("id\t\tname\t\tprice\t\tbuynumber");
        for (int i = 0; i < shopCar.length; i++) {
            Goods a = shopCar[i];
            if (a != null){
                System.out.println(a.getId()+"\t\t"+a.getName()+"\t\t\t"+a.getPrice()+"\t\t\t"+a.getBuynumber());
            }else {
                break;
            }
        }
    }

    public static void updateGoods(Goods[] shopCar,Scanner sc){
        System.out.println("请输入你想要修改数量的商品ID:");
        int id = sc.nextInt();
        for (int i = 0; i < shopCar.length; i++) {
            Goods a = shopCar[i];
            if (a != null){
                if (a.getId() == id){
                    System.out.println("请输入修改后的商品数量:");
                    a.setBuynumber(sc.nextInt()) ;
                    System.out.println("已修改完毕！");
                    break;
                }
            }else {
                System.out.println("你输入的ID有误，不存在id为"+id+"的商品");
                break;
            }
        }
    }

    public static void payGoods(Goods[] shopCar){
        double sum = 0;
        for (int i = 0; i < shopCar.length; i++) {
            Goods a = shopCar[i];
            if (a != null){
                sum += (a.getPrice()*a.getBuynumber());
            }else {
                break;
            }
        }
        System.out.println("你所购买所有商品的总价格为:"+ sum);
    }
}
