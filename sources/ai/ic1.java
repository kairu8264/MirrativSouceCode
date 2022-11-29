package ai;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class ic1 extends ja1<vk> implements vk {

    /* renamed from: x  reason: collision with root package name */
    public final Map<View, wk> f5180x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f5181y;

    /* renamed from: z  reason: collision with root package name */
    public final fl2 f5182z;

    public ic1(Context context, Set<gc1<vk>> set, fl2 fl2Var) {
        super(set);
        this.f5180x = new WeakHashMap(1);
        this.f5181y = context;
        this.f5182z = fl2Var;
    }

    public final synchronized void S0(View view) {
        wk wkVar = this.f5180x.get(view);
        if (wkVar == null) {
            wkVar = new wk(this.f5181y, view);
            wkVar.a(this);
            this.f5180x.put(view, wkVar);
        }
        if (this.f5182z.T) {
            if (((Boolean) ft.c().c(ox.T0)).booleanValue()) {
                wkVar.e(((Long) ft.c().c(ox.S0)).longValue());
                return;
            }
        }
        wkVar.f();
    }

    public final synchronized void T0(View view) {
        if (this.f5180x.containsKey(view)) {
            this.f5180x.get(view).b(this);
            this.f5180x.remove(view);
        }
    }

    @Override // ai.vk
    public final synchronized void U(final uk ukVar) {
        C0(new ia1(ukVar) { // from class: ai.hc1

            /* renamed from: a  reason: collision with root package name */
            public final uk f4820a;

            {
                this.f4820a = ukVar;
            }

            @Override // ai.ia1
            public final void a(Object obj) {
                ((vk) obj).U(this.f4820a);
            }
        });
    }
}
