package o8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class e extends ArrayList<d> {
    public String f() {
        if (isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<d> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().a());
            sb2.append(',');
        }
        return sb2.substring(0, sb2.length() - 1);
    }

    public List<String> g() {
        ArrayList arrayList = new ArrayList();
        Iterator<d> it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        return arrayList;
    }
}
