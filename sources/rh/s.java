package rh;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes3.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f51514a;

    /* renamed from: b  reason: collision with root package name */
    public final String f51515b;

    public s(Context context) {
        p.i(context);
        Resources resources = context.getResources();
        this.f51514a = resources;
        this.f51515b = resources.getResourcePackageName(nh.i.f43556a);
    }

    public String a(String str) {
        int identifier = this.f51514a.getIdentifier(str, "string", this.f51515b);
        if (identifier == 0) {
            return null;
        }
        return this.f51514a.getString(identifier);
    }
}
