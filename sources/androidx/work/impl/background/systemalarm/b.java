package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.d;
import java.util.ArrayList;
import java.util.List;
import k5.j;
import t5.p;

/* loaded from: classes.dex */
public class b {

    /* renamed from: e  reason: collision with root package name */
    public static final String f16594e = j.f("ConstraintsCmdHandler");

    /* renamed from: a  reason: collision with root package name */
    public final Context f16595a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16596b;

    /* renamed from: c  reason: collision with root package name */
    public final d f16597c;

    /* renamed from: d  reason: collision with root package name */
    public final p5.d f16598d;

    public b(Context context, int i10, d dVar) {
        this.f16595a = context;
        this.f16596b = i10;
        this.f16597c = dVar;
        this.f16598d = new p5.d(context, dVar.f(), null);
    }

    public void a() {
        List<p> d10 = this.f16597c.g().o().L().d();
        ConstraintProxy.a(this.f16595a, d10);
        this.f16598d.d(d10);
        ArrayList<p> arrayList = new ArrayList(d10.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (p pVar : d10) {
            String str = pVar.f53192a;
            if (currentTimeMillis >= pVar.a() && (!pVar.b() || this.f16598d.c(str))) {
                arrayList.add(pVar);
            }
        }
        for (p pVar2 : arrayList) {
            String str2 = pVar2.f53192a;
            Intent b10 = a.b(this.f16595a, str2);
            j.c().a(f16594e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            d dVar = this.f16597c;
            dVar.k(new d.b(dVar, b10, this.f16596b));
        }
        this.f16598d.e();
    }
}
