package l0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class w0<T> extends s1<T> implements Parcelable {

    /* renamed from: y  reason: collision with root package name */
    public static final b f39298y = new b(null);
    public static final Parcelable.Creator<w0<Object>> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.ClassLoaderCreator<w0<Object>> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public w0<Object> createFromParcel(Parcel parcel) {
            jo.p.h(parcel, "parcel");
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public w0<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            t1 h10;
            jo.p.h(parcel, "parcel");
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                h10 = u1.h();
            } else if (readInt == 1) {
                h10 = u1.n();
            } else if (readInt == 2) {
                h10 = u1.k();
            } else {
                throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            return new w0<>(readValue, h10);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public w0<Object>[] newArray(int i10) {
            return new w0[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(T t10, t1<T> t1Var) {
        super(t10, t1Var);
        jo.p.h(t1Var, "policy");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11;
        jo.p.h(parcel, "parcel");
        parcel.writeValue(getValue());
        t1<T> i12 = i();
        if (jo.p.c(i12, u1.h())) {
            i11 = 0;
        } else if (jo.p.c(i12, u1.n())) {
            i11 = 1;
        } else if (!jo.p.c(i12, u1.k())) {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        } else {
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
