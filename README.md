
# [jjdxm_statusbar][project] #
## Introduction ##

这是一个为Android App 设置状态栏的工具类， 可以在4.4及其以上系统中实现 沉浸式状态栏/状态栏变色，支持设置状态栏透明度，整理成一个工具类，方便需要的开发者。

## Features ##

## Screenshots ##

<img src="https://raw.githubusercontent.com/jjdxmashl/jjdxm_statusbar/master/screenshots/icon01.png" width="300"> 
<img src="https://raw.githubusercontent.com/jjdxmashl/jjdxm_statusbar/master/screenshots/icon02.png" width="300"> 
 
## Download ##

[demo apk下载][downapk]

Download or grab via Maven:

	<dependency>
	  <groupId>com.dou361.statusbar</groupId>
	  <artifactId>jjdxm-statusbar</artifactId>
	  <version>x.x.x</version>
	</dependency>

or Gradle:

	compile 'com.dou361.statusbar:jjdxm-statusbar:x.x.x'


历史版本：

	compile 'com.dou361.statusbar:jjdxm-statusbar:1.0.0'

jjdxm-statusbar requires at minimum Java 15 or Android 4.0.

## Get Started ##

1.在 setContentView() 之后调用你需要的方法，例如:

	setContentView(R.layout.main_activity);
	StatusBarUtil.setColor(MainActivity.this, mColor);

2. 如果你在一个包含 DrawerLayout 的界面中使用, 你需要在布局文件中为 DrawerLayout 添加 android:fitsSystemWindows="true" 属性:
 
	<android.support.v4.widget.DrawerLayout
	    xmlns:android="http://schemas.android.com/apk/res/android"
	    xmlns:app="http://schemas.android.com/apk/res-auto"
	    android:id="@+id/drawer_layout"
	    android:layout_width="match_parent"
	    android:layout_height="match_parent"
	    android:fitsSystemWindows="true">

    	...

	</android.support.v4.widget.DrawerLayout>

3. 当你设置了 statusBarAlpha 值时，该值需要在 0 ~ 255 之间
4. 在 Fragment 中的使用可以参照 UseInFragmentActivity.java 来实现

## More Actions ##

## ChangeLog ##

## About Author ##

#### 个人网站:[http://www.dou361.com][web] ####
#### GitHub:[jjdxmashl][github] ####
#### QQ:316988670 ####
#### 交流QQ群:548545202 ####


## License ##

    Copyright (C) dou361, The Framework Open Source Project
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
     	http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

## (Frequently Asked Questions)FAQ ##
## Bugs Report and Help ##

If you find any bug when using project, please report [here][issues]. Thanks for helping us building a better one.




[web]:http://www.dou361.com
[github]:https://github.com/jjdxmashl/
[project]:https://github.com/jjdxmashl/jjdxm_statusbar/
[issues]:https://github.com/jjdxmashl/jjdxm_statusbar/issues/new
[downapk]:https://raw.githubusercontent.com/jjdxmashl/jjdxm_statusbar/master/apk/app-debug.apk
[lastaar]:https://raw.githubusercontent.com/jjdxmashl/jjdxm_statusbar/master/release/jjdxm-statusbar-1.0.0.aar
[lastjar]:https://raw.githubusercontent.com/jjdxmashl/jjdxm_statusbar/master/release/jjdxm-statusbar-1.0.0.jar
[icon01]:https://raw.githubusercontent.com/jjdxmashl/jjdxm_statusbar/master/screenshots/icon01.png
[icon02]:https://raw.githubusercontent.com/jjdxmashl/jjdxm_statusbar/master/screenshots/icon02.png