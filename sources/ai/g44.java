package ai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes3.dex */
public final class g44 implements v34 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<w34<?>>> f4339a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final k34 f4340b;

    /* renamed from: c  reason: collision with root package name */
    public final BlockingQueue<w34<?>> f4341c;

    /* renamed from: d  reason: collision with root package name */
    public final o34 f4342d;

    /* JADX WARN: Multi-variable type inference failed */
    public g44(k34 k34Var, k34 k34Var2, BlockingQueue<w34<?>> blockingQueue, o34 o34Var) {
        this.f4342d = blockingQueue;
        this.f4340b = k34Var;
        this.f4341c = k34Var2;
    }

    @Override // ai.v34
    public final synchronized void a(w34<?> w34Var) {
        String p10 = w34Var.p();
        List<w34<?>> remove = this.f4339a.remove(p10);
        if (remove == null || remove.isEmpty()) {
            return;
        }
        if (f44.f3946b) {
            f44.a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), p10);
        }
        w34<?> remove2 = remove.remove(0);
        this.f4339a.put(p10, remove);
        remove2.B(this);
        try {
            this.f4341c.put(remove2);
        } catch (InterruptedException e10) {
            f44.c("Couldn't add request to queue. %s", e10.toString());
            Thread.currentThread().interrupt();
            this.f4340b.b();
        }
    }

    @Override // ai.v34
    public final void b(w34<?> w34Var, c44<?> c44Var) {
        List<w34<?>> remove;
        h34 h34Var = c44Var.f2710b;
        if (h34Var != null && !h34Var.a(System.currentTimeMillis())) {
            String p10 = w34Var.p();
            synchronized (this) {
                remove = this.f4339a.remove(p10);
            }
            if (remove != null) {
                if (f44.f3946b) {
                    f44.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), p10);
                }
                for (w34<?> w34Var2 : remove) {
                    this.f4342d.a(w34Var2, c44Var, null);
                }
                return;
            }
            return;
        }
        a(w34Var);
    }

    public final synchronized boolean c(w34<?> w34Var) {
        String p10 = w34Var.p();
        if (this.f4339a.containsKey(p10)) {
            List<w34<?>> list = this.f4339a.get(p10);
            if (list == null) {
                list = new ArrayList<>();
            }
            w34Var.h("waiting-for-response");
            list.add(w34Var);
            this.f4339a.put(p10, list);
            if (f44.f3946b) {
                f44.b("Request for cacheKey=%s is in flight, putting on hold.", p10);
            }
            return true;
        }
        this.f4339a.put(p10, null);
        w34Var.B(this);
        if (f44.f3946b) {
            f44.b("new request, sending to network %s", p10);
        }
        return false;
    }
}
