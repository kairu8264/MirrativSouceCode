package v1;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.z;
import java.util.Arrays;
import jo.p;
import l0.i;

/* loaded from: classes.dex */
public final class f {
    public static final Resources a(i iVar, int i10) {
        iVar.G(z.f());
        Resources resources = ((Context) iVar.G(z.g())).getResources();
        p.g(resources, "LocalContext.current.resources");
        return resources;
    }

    public static final String b(int i10, i iVar, int i11) {
        String string = a(iVar, 0).getString(i10);
        p.g(string, "resources.getString(id)");
        return string;
    }

    public static final String c(int i10, Object[] objArr, i iVar, int i11) {
        p.h(objArr, "formatArgs");
        String string = a(iVar, 0).getString(i10, Arrays.copyOf(objArr, objArr.length));
        p.g(string, "resources.getString(id, *formatArgs)");
        return string;
    }
}
