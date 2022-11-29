package ai;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class n33<OutputT> extends w23<OutputT> {
    public static final j33 F;
    public static final Logger G = Logger.getLogger(n33.class.getName());
    public volatile Set<Throwable> D = null;
    public volatile int E;

    static {
        Throwable th2;
        j33 m33Var;
        try {
            m33Var = new l33(AtomicReferenceFieldUpdater.newUpdater(n33.class, Set.class, "D"), AtomicIntegerFieldUpdater.newUpdater(n33.class, "E"));
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            m33Var = new m33(null);
        }
        F = m33Var;
        if (th2 != null) {
            G.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    public n33(int i10) {
        this.E = i10;
    }

    public final Set<Throwable> I() {
        Set<Throwable> set = this.D;
        if (set == null) {
            Set<Throwable> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            L(newSetFromMap);
            F.a(this, null, newSetFromMap);
            Set<Throwable> set2 = this.D;
            set2.getClass();
            return set2;
        }
        return set;
    }

    public final int J() {
        return F.b(this);
    }

    public final void K() {
        this.D = null;
    }

    public abstract void L(Set<Throwable> set);
}
