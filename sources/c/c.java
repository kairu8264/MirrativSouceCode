package c;

import android.content.Context;
import android.content.Intent;
import jo.h;
import jo.p;

/* loaded from: classes.dex */
public final class c extends c.a<Intent, androidx.activity.result.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18593a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    @Override // c.a
    /* renamed from: d */
    public Intent a(Context context, Intent intent) {
        p.h(context, "context");
        p.h(intent, "input");
        return intent;
    }

    @Override // c.a
    /* renamed from: e */
    public androidx.activity.result.a c(int i10, Intent intent) {
        return new androidx.activity.result.a(i10, intent);
    }
}
