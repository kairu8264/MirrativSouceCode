package ga;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.widget.Toast;
import da.i;
import fa.c;
import jo.p;
import p.d;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final c f32827a;

    public b(c cVar) {
        p.h(cVar, "floatViewManager");
        this.f32827a = cVar;
    }

    @Override // ga.a
    public void a(Context context, Uri uri) {
        p.h(context, "context");
        p.h(uri, "uri");
        b(context, uri, true);
    }

    public void b(Context context, Uri uri, boolean z10) {
        p.h(context, "context");
        p.h(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        try {
            if (z10) {
                new d.a().a().a(context, uri);
            } else {
                context.startActivity(intent);
            }
        } catch (ActivityNotFoundException e10) {
            g9.a.c(e10);
            if (Settings.canDrawOverlays(context) && !(context instanceof Activity)) {
                c cVar = this.f32827a;
                String string = context.getResources().getString(i.text_please_set_valid_browser_for_android);
                p.g(string, "context.resources.getStr…alid_browser_for_android)");
                cVar.a(new fa.a(context, string, false));
                return;
            }
            Toast.makeText(context, i.text_please_set_valid_browser_for_android, 0).show();
        }
    }
}
