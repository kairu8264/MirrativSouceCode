package er;

import ep.e0;
import er.f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* loaded from: classes4.dex */
public final class n extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public static final f.a f31156a = new n();

    @IgnoreJRERequirement
    /* loaded from: classes4.dex */
    public static final class a<T> implements f<e0, Optional<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final f<e0, T> f31157a;

        public a(f<e0, T> fVar) {
            this.f31157a = fVar;
        }

        @Override // er.f
        /* renamed from: b */
        public Optional<T> a(e0 e0Var) throws IOException {
            return Optional.ofNullable(this.f31157a.a(e0Var));
        }
    }

    @Override // er.f.a
    public f<e0, ?> d(Type type, Annotation[] annotationArr, t tVar) {
        if (f.a.b(type) != Optional.class) {
            return null;
        }
        return new a(tVar.h(f.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
