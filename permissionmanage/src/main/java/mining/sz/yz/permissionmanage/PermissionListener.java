package mining.sz.yz.permissionmanage;

import java.util.List;

/**
 * Created by Czm on 2018/11/29.
 */

public interface PermissionListener {
    void onSucceed(int requestCode, List<String> grantPermissions);

    void onFailed(int requestCode, List<String> deniedPermissions);

}
