package mining.sz.yz.permissionmanage;

/**
 * Created by Czm on 2018/11/29.
 */

public interface Rationale extends CancelablePermission
{
    /**
     * Go request permission.
     */
    void resume();
}
