package ai;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class ya2 implements xc2<za2> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f12492a;

    /* renamed from: b  reason: collision with root package name */
    public final yl2 f12493b;

    /* renamed from: c  reason: collision with root package name */
    public final PackageInfo f12494c;

    /* renamed from: d  reason: collision with root package name */
    public final yg.r1 f12495d;

    public ya2(t43 t43Var, yl2 yl2Var, PackageInfo packageInfo, yg.r1 r1Var) {
        this.f12492a = t43Var;
        this.f12493b = yl2Var;
        this.f12494c = packageInfo;
        this.f12495d = r1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
        if (r9 == 3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void a(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.ya2.a(java.util.ArrayList, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ za2 b() throws Exception {
        final ArrayList<String> arrayList = this.f12493b.f12653g;
        return arrayList == null ? ua2.f10665a : arrayList.isEmpty() ? va2.f11013a : new za2(this, arrayList) { // from class: ai.wa2

            /* renamed from: a  reason: collision with root package name */
            public final ya2 f11532a;

            /* renamed from: b  reason: collision with root package name */
            public final ArrayList f11533b;

            {
                this.f11532a = this;
                this.f11533b = arrayList;
            }

            @Override // ai.wc2
            public final void d(Bundle bundle) {
                this.f11532a.a(this.f11533b, bundle);
            }
        };
    }

    @Override // ai.xc2
    public final s43<za2> zza() {
        return this.f12492a.h(new Callable(this) { // from class: ai.ta2

            /* renamed from: a  reason: collision with root package name */
            public final ya2 f10207a;

            {
                this.f10207a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f10207a.b();
            }
        });
    }
}
