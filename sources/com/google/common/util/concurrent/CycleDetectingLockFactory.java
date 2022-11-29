package com.google.common.util.concurrent;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import lk.a0;
import lk.v;
import lk.z;

@CanIgnoreReturnValue
/* loaded from: classes3.dex */
public class CycleDetectingLockFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentMap<Class<? extends Enum>, Map<? extends Enum, c>> f27936a = new a0().h().f();

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f27937b = Logger.getLogger(CycleDetectingLockFactory.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final ThreadLocal<ArrayList<c>> f27938c = new a();

    /* loaded from: classes3.dex */
    public static final class PotentialDeadlockException extends b {

        /* renamed from: y  reason: collision with root package name */
        public final b f27939y;

        @Override // java.lang.Throwable
        public String getMessage() {
            StringBuilder sb2 = new StringBuilder(super.getMessage());
            for (Throwable th2 = this.f27939y; th2 != null; th2 = th2.getCause()) {
                sb2.append(", ");
                sb2.append(th2.getMessage());
            }
            return sb2.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static class a extends ThreadLocal<ArrayList<c>> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ArrayList<c> initialValue() {
            return z.h(3);
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends IllegalStateException {

        /* renamed from: w  reason: collision with root package name */
        public static final StackTraceElement[] f27940w = new StackTraceElement[0];

        /* renamed from: x  reason: collision with root package name */
        public static final v<String> f27941x = v.B(CycleDetectingLockFactory.class.getName(), b.class.getName(), c.class.getName());
    }

    /* loaded from: classes3.dex */
    public static class c {
    }
}
