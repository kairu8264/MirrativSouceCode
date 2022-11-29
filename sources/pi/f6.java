package pi;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class f6 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f47804a;

    /* renamed from: b  reason: collision with root package name */
    public String f47805b;

    /* renamed from: c  reason: collision with root package name */
    public String f47806c;

    /* renamed from: d  reason: collision with root package name */
    public String f47807d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f47808e;

    /* renamed from: f  reason: collision with root package name */
    public long f47809f;

    /* renamed from: g  reason: collision with root package name */
    public hi.o1 f47810g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f47811h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f47812i;

    /* renamed from: j  reason: collision with root package name */
    public String f47813j;

    public f6(Context context, hi.o1 o1Var, Long l10) {
        this.f47811h = true;
        rh.p.i(context);
        Context applicationContext = context.getApplicationContext();
        rh.p.i(applicationContext);
        this.f47804a = applicationContext;
        this.f47812i = l10;
        if (o1Var != null) {
            this.f47810g = o1Var;
            this.f47805b = o1Var.B;
            this.f47806c = o1Var.A;
            this.f47807d = o1Var.f35892z;
            this.f47811h = o1Var.f35891y;
            this.f47809f = o1Var.f35890x;
            this.f47813j = o1Var.D;
            Bundle bundle = o1Var.C;
            if (bundle != null) {
                this.f47808e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
