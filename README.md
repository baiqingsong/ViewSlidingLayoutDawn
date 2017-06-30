# 自定义控件 -- 上拉下拉弹动和listiew的果冻效果

* [自定义控件简介](#自定义控件简介)
* [SlidingLayout的使用](#slidinglayout的使用)


## 自定义控件简介

SlidingLayout  是主要的控件展示类，其中需要在styles里面配置SlidingLayout属性
Instrument   是效果辅助类，辅助下拉弹动的效果，需要在build.gradle里面引用包
```
dependencies {
    compile 'com.nineoldandroids:library:2.4.0'
}
```

## SlidingLayout的使用

在原有的控件外嵌套自定义控件SlidingLayout
SlidingLayout控件的属性
```
<declare-styleable name="SlidingLayout">
    <attr name="background_view" format="reference"/>
    <attr name="sliding_mode" format="enum">
        <enum name="both" value="0"/>
        <enum name="top" value="1"/>
        <enum name="bottom" value="2"/>
    </attr>
    <attr name="sliding_pointer_mode" format="enum">
        <enum name="one" value="0"/>
        <enum name="more" value="1"/>
    </attr>
    <attr name="top_max" format="dimension"/>
</declare-styleable>
```
其中background_view是显示下拉后背景的view


此控件是参照别人的项目提取出来的。
[https://github.com/HomHomLin/SlidingLayout](https://github.com/HomHomLin/SlidingLayout "SlidingLayout 控件参照地址")

