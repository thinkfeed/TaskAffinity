TaskAffinity
============

android:taskAffinity 测试


android:taskAffinity
An affinity name that applies to all activities within the application, except for those that set a different affinity with their own taskAffinity attributes. See that attribute for more information.
By default, all activities within an application share the same affinity. The name of that affinity is the same as the package name set by the <manifest> element.

每个Activity都有taskAffinity属性，这个属性指出了它希望进入的Task。如果一个Activity没有显式的指明该Activity的taskAffinity，那么它的这个属性就等于Application指明的taskAffinity，如果Application也没有指明，那么该taskAffinity的值就等于包名。而Task也有自己的affinity属性，它的值等于它的根Activity的taskAffinity的值。

一开始，创建的Activity都会在创建它的Task中，并且大部分都在这里度过了它的整个生命。然而有一些情况，创建的Activity会被分配其它的Task中去，有的甚至，本来在一个Task中，之后出现了转移。我们首先分析一下android文档给我们介绍的两种情况。
第一种情况。如果该Activity的allowTaskReparenting设置为true，它进入后台，当一个和它有相同affinity的Task进入前台时，它会重新宿主，进入到该前台的task中。
第二种情况。如果加载某个Activity的intent，Flag被设置成FLAG_ACTIVITY_NEW_TASK时，它会首先检查是否存在与自己taskAffinity相同的Task，如果存在，那么它会直接宿主到该Task中，如果不存在则重新创建Task。
