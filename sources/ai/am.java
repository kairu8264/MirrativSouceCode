package ai;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* loaded from: classes3.dex */
public final class am {

    /* renamed from: a  reason: collision with root package name */
    public final int f1918a;

    /* renamed from: b  reason: collision with root package name */
    public final xl f1919b = new cm();

    public am(int i10) {
        this.f1918a = i10;
    }

    public final String a(ArrayList<String> arrayList) {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(arrayList.get(i10).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] split = sb2.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zl zlVar = new zl();
        PriorityQueue priorityQueue = new PriorityQueue(this.f1918a, new yl(this));
        for (String str : split) {
            String[] b10 = bm.b(str, false);
            if (b10.length != 0) {
                fm.a(b10, this.f1918a, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zlVar.f13025b.write(this.f1919b.a(((em) it.next()).f3724b));
            } catch (IOException e10) {
                uj0.d("Error while writing hash to byteStream", e10);
            }
        }
        return zlVar.toString();
    }
}
