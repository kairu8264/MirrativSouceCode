package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.o;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes.dex */
public abstract class x<D extends o> {

    /* loaded from: classes.dex */
    public interface a {
    }

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface b {
        String value();
    }

    public abstract D a();

    public abstract o b(D d10, Bundle bundle, u uVar, a aVar);

    public void c(Bundle bundle) {
    }

    public Bundle d() {
        return null;
    }

    public abstract boolean e();
}
