package b3;

import android.app.RemoteInput;

/* loaded from: classes.dex */
public final class o {
    public static RemoteInput a(o oVar) {
        throw null;
    }

    public static RemoteInput[] b(o[] oVarArr) {
        if (oVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[oVarArr.length];
        for (int i10 = 0; i10 < oVarArr.length; i10++) {
            remoteInputArr[i10] = a(oVarArr[i10]);
        }
        return remoteInputArr;
    }
}
