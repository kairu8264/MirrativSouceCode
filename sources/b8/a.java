package b8;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class a implements l {

    /* renamed from: a  reason: collision with root package name */
    public final Set<m> f17073a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public boolean f17074b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17075c;

    @Override // b8.l
    public void a(m mVar) {
        this.f17073a.remove(mVar);
    }

    @Override // b8.l
    public void b(m mVar) {
        this.f17073a.add(mVar);
        if (this.f17075c) {
            mVar.onDestroy();
        } else if (this.f17074b) {
            mVar.onStart();
        } else {
            mVar.onStop();
        }
    }

    public void c() {
        this.f17075c = true;
        for (m mVar : i8.k.j(this.f17073a)) {
            mVar.onDestroy();
        }
    }

    public void d() {
        this.f17074b = true;
        for (m mVar : i8.k.j(this.f17073a)) {
            mVar.onStart();
        }
    }

    public void e() {
        this.f17074b = false;
        for (m mVar : i8.k.j(this.f17073a)) {
            mVar.onStop();
        }
    }
}
