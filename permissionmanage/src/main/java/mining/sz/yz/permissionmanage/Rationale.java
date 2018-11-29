package mining.sz.yz.permissionmanage;



public interface Rationale extends CancelablePermission
{
    /**
     * Go request permission.
     */
    void resume();
}
