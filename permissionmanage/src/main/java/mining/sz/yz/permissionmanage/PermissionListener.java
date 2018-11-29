package mining.sz.yz.permissionmanage;

import java.util.List;


public interface PermissionListener {
    void onSucceed(int requestCode, List<String> grantPermissions);

    void onFailed(int requestCode, List<String> deniedPermissions);

}
