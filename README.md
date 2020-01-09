# BarUtils
沉浸式状态栏

添加：

###Step 1. Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

###Step 2. Add the dependency
```
dependencies {
	        implementation 'com.github.kimlllll:BarUtils:1.0.0'
	}
```


##使用方法：

####1. 将你的AndroidManifest.xml文件中的Theme设置成NoActionBar
```
<style name="AppTheme" parent="Theme.AppCompat.Light.NoActionBar">
        <!-- Customize your theme here. -->
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
    </style>
```

####2.设置沉浸式状态栏
  
#####第一种方式： 使用BarUtils
 1.把你的Activity根布局获取到
 2.使用BarUtils设置沉浸式状态栏
```
      //获取根布局
        ConstraintLayout content = findViewById(R.id.content);
        //设置StatusBar的颜色
        BarUtils.setStatusBarColor(this, Color.WHITE);
        //设置根布局Margin为StatusBar的高度
        BarUtils.addMarginTopEqualStatusBarHeight(content);
        //设置StatusBar为Light模式
        BarUtils.setStatusBarLightMode(this,true);

```
#####第二种方式：使用Bar2Utils
```
       //设置StatusBar的颜色
        Bar2Utils.setColorNoTranslucent(this,Color.WHITE);
        //设置StatusBar为light模式
        Bar2Utils.setStatusBarLightMode(this,true);
```



