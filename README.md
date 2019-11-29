# PermissionHelp

1、添加依赖

 allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
  dependencies {
	        implementation 'com.github.anaivez:PermissionHelp:master'
	}
  
  
  
  2、使用
  
  1)权限管理方法在PermissionManage里
 
  2)PermissionManage.hasPermission是检查是否已有权限
  
  3)PermissionManage.with申请权限,可以多组申请
   
   示例：
  
      
       if (!PermissionManage.hasPermission(this
                , android.Manifest.permission.WRITE_EXTERNAL_STORAGE
        )) {
            PermissionManage.with(this)
                    .requestCode(WHAT_PERMISSION)  //
                    .permission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE
                    )
                    .send();
        }
        
        
    用户权限回调
    
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        PermissionManage.onRequestPermissionsResult(requestCode, permissions, grantResults, listener);
    }

    private PermissionListener listener = new PermissionListener() {
        @Override
        public void onSucceed(int requestCode, List<String> grantedPermissions) {
        }

        @Override
        public void onFailed(int requestCode, List<String> deniedPermissions) {
            // 用户否勾选了不再提示并且拒绝了权限，那么提示用户到设置中授权。
            if (PermissionManage.hasAlwaysDeniedPermission(MainActivity.this, deniedPermissions)) {
                // 第一种：用默认的提示语。
                //PermissionManage.defaultSettingDialog(activity, WHAT_PERMISSION).show();
                CustomToast.makeText(getString(R.string.string_permission_all));
            }

        }
    };
  
  
