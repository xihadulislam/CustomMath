# Add to Gradle

Add this to your project level build.gradle file


allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
  
  #And then add this to your module level build.gradle file




dependencies {  implementation 'com.github.xihadulislam:CustomMath:1.0.0'}


