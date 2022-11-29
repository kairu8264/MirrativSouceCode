package jo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Object> f38147a;

    public h0(int i10) {
        this.f38147a = new ArrayList<>(i10);
    }

    public void a(Object obj) {
        this.f38147a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f38147a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f38147a, objArr);
            }
        } else if (obj instanceof Collection) {
            this.f38147a.addAll((Collection) obj);
        } else if (obj instanceof Iterable) {
            for (Object obj2 : (Iterable) obj) {
                this.f38147a.add(obj2);
            }
        } else if (obj instanceof Iterator) {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                this.f38147a.add(it.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f38147a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f38147a.toArray(objArr);
    }
}
