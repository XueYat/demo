package designpatterns.atamplatemethod;

/**
 * 模板方法 通过模板控制流程，定义一个模板结构，将具体内容延迟到子类去实现。在不改变模板结构的前提下在子类中重新定义模板中的内容。模板方法模式是基于”继承“的；反向控制，符合开闭原则
 * @author YatXue
 * @date 2019/7/2 8:11
 */
public abstract class Cooking {
    final void cooking(){
        pourOil();
        burningOil();
        serve();
        seasoning();
        dishes();
    }

    void pourOil(){
        System.out.println("倒油。。。");
    }

    void burningOil(){
        System.out.println("油热...");
    }

    abstract void serve();

    abstract void seasoning();

    void dishes(){
        System.out.println("上菜...");
    }
}
