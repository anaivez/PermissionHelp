package mining.sz.yz.permissionmanage;

import android.support.annotation.NonNull;

/**
 * Created by Czm on 2018/11/29.
 */

public interface Permission {
    @NonNull
    Permission permission(String... permissions);

    @NonNull
    Permission requestCode(int requestCode);

    @NonNull
    Permission rationale(RationaleListener listener);

    void send();
}
