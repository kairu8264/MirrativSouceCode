package i5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class b extends VersionedParcel {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f36325d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f36326e;

    /* renamed from: f  reason: collision with root package name */
    public final int f36327f;

    /* renamed from: g  reason: collision with root package name */
    public final int f36328g;

    /* renamed from: h  reason: collision with root package name */
    public final String f36329h;

    /* renamed from: i  reason: collision with root package name */
    public int f36330i;

    /* renamed from: j  reason: collision with root package name */
    public int f36331j;

    /* renamed from: k  reason: collision with root package name */
    public int f36332k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new s.a(), new s.a(), new s.a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void A(byte[] bArr) {
        if (bArr != null) {
            this.f36326e.writeInt(bArr.length);
            this.f36326e.writeByteArray(bArr);
            return;
        }
        this.f36326e.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f36326e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void E(int i10) {
        this.f36326e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void G(Parcelable parcelable) {
        this.f36326e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void I(String str) {
        this.f36326e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i10 = this.f36330i;
        if (i10 >= 0) {
            int i11 = this.f36325d.get(i10);
            int dataPosition = this.f36326e.dataPosition();
            this.f36326e.setDataPosition(i11);
            this.f36326e.writeInt(dataPosition - i11);
            this.f36326e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public VersionedParcel b() {
        Parcel parcel = this.f36326e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f36331j;
        if (i10 == this.f36327f) {
            i10 = this.f36328g;
        }
        int i11 = i10;
        return new b(parcel, dataPosition, i11, this.f36329h + "  ", this.f16456a, this.f16457b, this.f16458c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean g() {
        return this.f36326e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] i() {
        int readInt = this.f36326e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f36326e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f36326e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean m(int i10) {
        while (this.f36331j < this.f36328g) {
            int i11 = this.f36332k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f36326e.setDataPosition(this.f36331j);
            int readInt = this.f36326e.readInt();
            this.f36332k = this.f36326e.readInt();
            this.f36331j += readInt;
        }
        return this.f36332k == i10;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int o() {
        return this.f36326e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T q() {
        return (T) this.f36326e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String s() {
        return this.f36326e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void w(int i10) {
        a();
        this.f36330i = i10;
        this.f36325d.put(i10, this.f36326e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void y(boolean z10) {
        this.f36326e.writeInt(z10 ? 1 : 0);
    }

    public b(Parcel parcel, int i10, int i11, String str, s.a<String, Method> aVar, s.a<String, Method> aVar2, s.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f36325d = new SparseIntArray();
        this.f36330i = -1;
        this.f36331j = 0;
        this.f36332k = -1;
        this.f36326e = parcel;
        this.f36327f = i10;
        this.f36328g = i11;
        this.f36331j = i10;
        this.f36329h = str;
    }
}
