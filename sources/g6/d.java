package g6;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import j6.m;
import jo.p;

/* loaded from: classes.dex */
public final class d implements c<Integer, Uri> {
    @Override // g6.c
    public /* bridge */ /* synthetic */ Uri a(Integer num, m mVar) {
        return c(num.intValue(), mVar);
    }

    public final boolean b(int i10, Context context) {
        try {
            return context.getResources().getResourceEntryName(i10) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    public Uri c(int i10, m mVar) {
        if (b(i10, mVar.g())) {
            Uri parse = Uri.parse("android.resource://" + ((Object) mVar.g().getPackageName()) + '/' + i10);
            p.g(parse, "parse(this)");
            return parse;
        }
        return null;
    }
}
