# ANToast
Init v1.0.0

<img src="https://github.com/alirezanasrollahzadeh2003/ANToast/blob/master/logo-no-background.png" alt="An Toast">

ANToast is a useful library for displaying messages with support for Jetpack Compose and Xml.

My personal website. 
https://alirezanasrollahzadeh.ir

To get this library into your build:

Step 1. Add this repository to your build file
```
allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
  	}
```
Step 2. Add the dependency

``` implementation 'com.github.alirezanasrollahzadeh2003:ANToast:v1.0.0' ```

Use:

# SuccessToast


``` ANToast.success(context = context).message(message).build().show() ```

# FailureToast


``` ANToast.failure(context = context).message(message).build().show() ```

# WarningToast


``` ANToast.warning(context = context).message(message).build().show() ```

# InfoToast


``` ANToast.info(context = context).message(message).build().show() ```

# Settings

**Support Gravity**

``` ANToast.success(context = context).gravity(Gravity.TOP).message(message).build().show() ```

**Support TextSize**

``` ANToast.success(context = context).textSize(16).message(message).build().show() ```

**Support Duration**

``` ANToast.success(context = context).duration(Toast.LENGTH_LONG).message(message).build().show() ```

** Support Rtl **

``` ANToast.success(context = context).isRtl(true).duration(Toast.LENGTH_LONG).message(message).build().show() ```

*Default False*

[![](https://jitpack.io/v/alirezanasrollahzadeh2003/AnCrashLytics.svg)](https://jitpack.io/#alirezanasrollahzadeh2003/ANToast)
