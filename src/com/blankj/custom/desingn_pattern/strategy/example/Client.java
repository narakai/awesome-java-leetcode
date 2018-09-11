package com.blankj.custom.desingn_pattern.strategy.example;


//https://blog.csdn.net/u012124438/article/details/70039943/
//
//策略模式的定义和使用场景
//
//        定义：策略模式定义了一系列的算法，并将每一个算法封装起来，而且使他们可以相互替换，让算法独立于使用它的客户而独立变化。
//
//        分析下定义，策略模式定义和封装了一系列的算法，它们是可以相互替换的，也就是说它们具有共性，而它们的共性就体现在策略接口的行为上，另外为了达到最后一句话的目的，也就是说让算法独立于使用它的客户而独立变化，我们需要让客户端依赖于策略接口。
//
//        策略模式的使用场景：
//
//        1.针对同一类型问题的多种处理方式，仅仅是具体行为有差别时；
//        2.需要安全地封装多种同一类型的操作时；
//        3.出现同一抽象类有多个子类，而又需要使用 if-else 或者 switch-case 来选择具体子类时。

public class Client {
    public static void main(String[] args) {
        Player player = new Player();
        player.buy(5000D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(12000D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(12000D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(12000D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
    }
}
