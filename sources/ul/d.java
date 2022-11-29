package ul;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public interface d {
    <T> void a(Class<T> cls, b<? super T> bVar);

    <T> void b(Class<T> cls, Executor executor, b<? super T> bVar);
}
