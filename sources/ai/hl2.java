package ai;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class hl2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f4895a;

    /* renamed from: b  reason: collision with root package name */
    public final bp3 f4896b;

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList<fk2> f4897c;

    public hl2() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public hl2(CopyOnWriteArrayList<fk2> copyOnWriteArrayList, int i10, bp3 bp3Var) {
        this.f4897c = copyOnWriteArrayList;
        this.f4895a = i10;
        this.f4896b = bp3Var;
    }

    public final hl2 a(int i10, bp3 bp3Var) {
        return new hl2(this.f4897c, i10, bp3Var);
    }

    public final void b(Handler handler, gm2 gm2Var) {
        this.f4897c.add(new fk2(handler, gm2Var));
    }

    public final void c(gm2 gm2Var) {
        Iterator<fk2> it = this.f4897c.iterator();
        while (it.hasNext()) {
            fk2 next = it.next();
            if (next.f4071b == gm2Var) {
                this.f4897c.remove(next);
            }
        }
    }
}
