package ai;

import android.text.TextUtils;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class f22 {

    /* renamed from: a  reason: collision with root package name */
    public final vh.f f3895a;

    /* renamed from: b  reason: collision with root package name */
    public final g22 f3896b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f3897c = Collections.synchronizedList(new ArrayList());

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3898d = ((Boolean) ft.c().c(ox.f7970d5)).booleanValue();

    /* renamed from: e  reason: collision with root package name */
    public final vy1 f3899e;

    public f22(vh.f fVar, g22 g22Var, vy1 vy1Var) {
        this.f3895a = fVar;
        this.f3896b = g22Var;
        this.f3899e = vy1Var;
    }

    public static /* synthetic */ void f(f22 f22Var, String str, int i10, long j10, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 33);
        sb2.append(str);
        sb2.append(TopicConstant.SEPARATOR);
        sb2.append(i10);
        sb2.append(TopicConstant.SEPARATOR);
        sb2.append(j10);
        String sb3 = sb2.toString();
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb4 = new StringBuilder(sb3.length() + 1 + String.valueOf(str2).length());
            sb4.append(sb3);
            sb4.append(TopicConstant.SEPARATOR);
            sb4.append(str2);
            sb3 = sb4.toString();
        }
        f22Var.f3897c.add(sb3);
    }

    public final <T> s43<T> e(kl2 kl2Var, fl2 fl2Var, s43<T> s43Var) {
        long elapsedRealtime = this.f3895a.elapsedRealtime();
        String str = fl2Var.f4112w;
        if (str != null) {
            j43.p(s43Var, new e22(this, elapsedRealtime, str, fl2Var, kl2Var), hk0.f4883f);
        }
        return s43Var;
    }

    public final String g() {
        return TextUtils.join("_", this.f3897c);
    }
}
