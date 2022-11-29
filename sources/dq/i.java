package dq;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: d  reason: collision with root package name */
    public static final List<i> f29831d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public Object f29832a;

    /* renamed from: b  reason: collision with root package name */
    public p f29833b;

    /* renamed from: c  reason: collision with root package name */
    public i f29834c;

    public i(Object obj, p pVar) {
        this.f29832a = obj;
        this.f29833b = pVar;
    }

    public static i a(p pVar, Object obj) {
        List<i> list = f29831d;
        synchronized (list) {
            int size = list.size();
            if (size > 0) {
                i remove = list.remove(size - 1);
                remove.f29832a = obj;
                remove.f29833b = pVar;
                remove.f29834c = null;
                return remove;
            }
            return new i(obj, pVar);
        }
    }

    public static void b(i iVar) {
        iVar.f29832a = null;
        iVar.f29833b = null;
        iVar.f29834c = null;
        List<i> list = f29831d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(iVar);
            }
        }
    }
}
