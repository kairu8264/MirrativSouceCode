package b3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q implements Iterable<Intent> {

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<Intent> f16895w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public final Context f16896x;

    /* loaded from: classes.dex */
    public interface a {
        Intent T();
    }

    public q(Context context) {
        this.f16896x = context;
    }

    public static q k(Context context) {
        return new q(context);
    }

    public q d(Intent intent) {
        this.f16895w.add(intent);
        return this;
    }

    public q f(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f16896x.getPackageManager());
        }
        if (component != null) {
            j(component);
        }
        d(intent);
        return this;
    }

    public q g(Activity activity) {
        Intent T = activity instanceof a ? ((a) activity).T() : null;
        if (T == null) {
            T = h.a(activity);
        }
        if (T != null) {
            ComponentName component = T.getComponent();
            if (component == null) {
                component = T.resolveActivity(this.f16896x.getPackageManager());
            }
            j(component);
            d(T);
        }
        return this;
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f16895w.iterator();
    }

    public q j(ComponentName componentName) {
        int size = this.f16895w.size();
        try {
            Intent b10 = h.b(this.f16896x, componentName);
            while (b10 != null) {
                this.f16895w.add(size, b10);
                b10 = h.b(this.f16896x, b10.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public void l() {
        m(null);
    }

    public void m(Bundle bundle) {
        if (!this.f16895w.isEmpty()) {
            ArrayList<Intent> arrayList = this.f16895w;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (c3.a.l(this.f16896x, intentArr, bundle)) {
                return;
            }
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f16896x.startActivity(intent);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
