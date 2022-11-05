package OOP.Extend.detail;

public class extends_constructor {

    // 所有的子类对象被创建时，也就是在创建子类时，父类构造器都会被先调用，再调用子类构造器，因为子类初始化的时候可能用到父类的数据，所以父类要先加载
    // 子类构造器的第一行默认语句都是super()，不写的话也是存在的。
    // 注意构造器中this()和super()都只能放在第一行，所以两者不能出现在同一个构造器中。
}
