package com.google.android.exoplayer2.util;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ParsableByteArray {
    private byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    public int bytesLeft() {
        return this.limit - this.position;
    }

    public int capacity() {
        return this.data.length;
    }

    public void ensureCapacity(int i10) {
        if (i10 > capacity()) {
            this.data = Arrays.copyOf(this.data, i10);
        }
    }

    public byte[] getData() {
        return this.data;
    }

    public int getPosition() {
        return this.position;
    }

    public int limit() {
        return this.limit;
    }

    public char peekChar() {
        byte[] bArr = this.data;
        int i10 = this.position;
        return (char) ((bArr[i10 + 1] & TagConstant.TAG_CAT_RESERVED) | ((bArr[i10] & TagConstant.TAG_CAT_RESERVED) << 8));
    }

    public int peekUnsignedByte() {
        return this.data[this.position] & TagConstant.TAG_CAT_RESERVED;
    }

    public void readBytes(ParsableBitArray parsableBitArray, int i10) {
        readBytes(parsableBitArray.data, 0, i10);
        parsableBitArray.setPosition(0);
    }

    public String readDelimiterTerminatedString(char c10) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i10 = this.position;
        while (i10 < this.limit && this.data[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.data;
        int i11 = this.position;
        String fromUtf8Bytes = Util.fromUtf8Bytes(bArr, i11, i10 - i11);
        this.position = i10;
        if (i10 < this.limit) {
            this.position = i10 + 1;
        }
        return fromUtf8Bytes;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public int readInt() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = ((bArr[i10] & TagConstant.TAG_CAT_RESERVED) << 24) | ((bArr[i11] & TagConstant.TAG_CAT_RESERVED) << 16);
        int i14 = i12 + 1;
        this.position = i14;
        int i15 = i13 | ((bArr[i12] & TagConstant.TAG_CAT_RESERVED) << 8);
        this.position = i14 + 1;
        return (bArr[i14] & TagConstant.TAG_CAT_RESERVED) | i15;
    }

    public int readInt24() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = (((bArr[i10] & TagConstant.TAG_CAT_RESERVED) << 24) >> 8) | ((bArr[i11] & TagConstant.TAG_CAT_RESERVED) << 8);
        this.position = i12 + 1;
        return (bArr[i12] & TagConstant.TAG_CAT_RESERVED) | i13;
    }

    public String readLine() {
        if (bytesLeft() == 0) {
            return null;
        }
        int i10 = this.position;
        while (i10 < this.limit && !Util.isLinebreak(this.data[i10])) {
            i10++;
        }
        int i11 = this.position;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.data;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.position = i11 + 3;
            }
        }
        byte[] bArr2 = this.data;
        int i12 = this.position;
        String fromUtf8Bytes = Util.fromUtf8Bytes(bArr2, i12, i10 - i12);
        this.position = i10;
        int i13 = this.limit;
        if (i10 == i13) {
            return fromUtf8Bytes;
        }
        byte[] bArr3 = this.data;
        if (bArr3[i10] == 13) {
            int i14 = i10 + 1;
            this.position = i14;
            if (i14 == i13) {
                return fromUtf8Bytes;
            }
        }
        int i15 = this.position;
        if (bArr3[i15] == 10) {
            this.position = i15 + 1;
        }
        return fromUtf8Bytes;
    }

    public int readLittleEndianInt() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = bArr[i10] & TagConstant.TAG_CAT_RESERVED;
        int i13 = i11 + 1;
        this.position = i13;
        int i14 = i12 | ((bArr[i11] & TagConstant.TAG_CAT_RESERVED) << 8);
        int i15 = i13 + 1;
        this.position = i15;
        int i16 = i14 | ((bArr[i13] & TagConstant.TAG_CAT_RESERVED) << 16);
        this.position = i15 + 1;
        return ((bArr[i15] & TagConstant.TAG_CAT_RESERVED) << 24) | i16;
    }

    public int readLittleEndianInt24() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = bArr[i10] & TagConstant.TAG_CAT_RESERVED;
        int i13 = i11 + 1;
        this.position = i13;
        int i14 = i12 | ((bArr[i11] & TagConstant.TAG_CAT_RESERVED) << 8);
        this.position = i13 + 1;
        return ((bArr[i13] & TagConstant.TAG_CAT_RESERVED) << 16) | i14;
    }

    public long readLittleEndianLong() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = i12 + 1;
        this.position = i13;
        int i14 = i13 + 1;
        this.position = i14;
        int i15 = i14 + 1;
        this.position = i15;
        int i16 = i15 + 1;
        this.position = i16;
        int i17 = i16 + 1;
        this.position = i17;
        this.position = i17 + 1;
        return (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 24) | ((bArr[i14] & 255) << 32) | ((bArr[i15] & 255) << 40) | ((bArr[i16] & 255) << 48) | ((bArr[i17] & 255) << 56);
    }

    public short readLittleEndianShort() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = bArr[i10] & TagConstant.TAG_CAT_RESERVED;
        this.position = i11 + 1;
        return (short) (((bArr[i11] & TagConstant.TAG_CAT_RESERVED) << 8) | i12);
    }

    public long readLittleEndianUnsignedInt() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = i12 + 1;
        this.position = i13;
        this.position = i13 + 1;
        return (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 24);
    }

    public int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = bArr[i10] & TagConstant.TAG_CAT_RESERVED;
        int i13 = i11 + 1;
        this.position = i13;
        int i14 = i12 | ((bArr[i11] & TagConstant.TAG_CAT_RESERVED) << 8);
        this.position = i13 + 1;
        return ((bArr[i13] & TagConstant.TAG_CAT_RESERVED) << 16) | i14;
    }

    public int readLittleEndianUnsignedIntToInt() {
        int readLittleEndianInt = readLittleEndianInt();
        if (readLittleEndianInt >= 0) {
            return readLittleEndianInt;
        }
        throw new IllegalStateException("Top bit not zero: " + readLittleEndianInt);
    }

    public int readLittleEndianUnsignedShort() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = bArr[i10] & TagConstant.TAG_CAT_RESERVED;
        this.position = i11 + 1;
        return ((bArr[i11] & TagConstant.TAG_CAT_RESERVED) << 8) | i12;
    }

    public long readLong() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = i12 + 1;
        this.position = i13;
        int i14 = i13 + 1;
        this.position = i14;
        int i15 = i14 + 1;
        this.position = i15;
        int i16 = i15 + 1;
        this.position = i16;
        int i17 = i16 + 1;
        this.position = i17;
        this.position = i17 + 1;
        return ((bArr[i10] & 255) << 56) | ((bArr[i11] & 255) << 48) | ((bArr[i12] & 255) << 40) | ((bArr[i13] & 255) << 32) | ((bArr[i14] & 255) << 24) | ((bArr[i15] & 255) << 16) | ((bArr[i16] & 255) << 8) | (bArr[i17] & 255);
    }

    public String readNullTerminatedString(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.position;
        int i12 = (i11 + i10) - 1;
        String fromUtf8Bytes = Util.fromUtf8Bytes(this.data, i11, (i12 >= this.limit || this.data[i12] != 0) ? i10 : i10 - 1);
        this.position += i10;
        return fromUtf8Bytes;
    }

    public short readShort() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        this.position = i11 + 1;
        return (short) ((bArr[i11] & TagConstant.TAG_CAT_RESERVED) | ((bArr[i10] & TagConstant.TAG_CAT_RESERVED) << 8));
    }

    public String readString(int i10) {
        return readString(i10, kk.d.f38839c);
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedByte() {
        byte[] bArr = this.data;
        int i10 = this.position;
        this.position = i10 + 1;
        return bArr[i10] & TagConstant.TAG_CAT_RESERVED;
    }

    public int readUnsignedFixedPoint1616() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = (bArr[i11] & TagConstant.TAG_CAT_RESERVED) | ((bArr[i10] & TagConstant.TAG_CAT_RESERVED) << 8);
        this.position = i12 + 2;
        return i13;
    }

    public long readUnsignedInt() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = i12 + 1;
        this.position = i13;
        this.position = i13 + 1;
        return ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8) | (bArr[i13] & 255);
    }

    public int readUnsignedInt24() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = i11 + 1;
        this.position = i12;
        int i13 = ((bArr[i10] & TagConstant.TAG_CAT_RESERVED) << 16) | ((bArr[i11] & TagConstant.TAG_CAT_RESERVED) << 8);
        this.position = i12 + 1;
        return (bArr[i12] & TagConstant.TAG_CAT_RESERVED) | i13;
    }

    public int readUnsignedIntToInt() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        throw new IllegalStateException("Top bit not zero: " + readInt);
    }

    public long readUnsignedLongToLong() {
        long readLong = readLong();
        if (readLong >= 0) {
            return readLong;
        }
        throw new IllegalStateException("Top bit not zero: " + readLong);
    }

    public int readUnsignedShort() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        this.position = i11 + 1;
        return (bArr[i11] & TagConstant.TAG_CAT_RESERVED) | ((bArr[i10] & TagConstant.TAG_CAT_RESERVED) << 8);
    }

    public long readUtf8EncodedLong() {
        int i10;
        int i11;
        byte b10;
        int i12;
        long j10 = this.data[this.position];
        int i13 = 7;
        while (true) {
            if (i13 < 0) {
                break;
            }
            if (((1 << i13) & j10) != 0) {
                i13--;
            } else if (i13 < 6) {
                j10 &= i12 - 1;
                i11 = 7 - i13;
            } else if (i13 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 != 0) {
            for (i10 = 1; i10 < i11; i10++) {
                if ((this.data[this.position + i10] & 192) != 128) {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
                }
                j10 = (j10 << 6) | (b10 & 63);
            }
            this.position += i11;
            return j10;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
    }

    public void reset(int i10) {
        reset(capacity() < i10 ? new byte[i10] : this.data, i10);
    }

    public void setLimit(int i10) {
        Assertions.checkArgument(i10 >= 0 && i10 <= this.data.length);
        this.limit = i10;
    }

    public void setPosition(int i10) {
        Assertions.checkArgument(i10 >= 0 && i10 <= this.limit);
        this.position = i10;
    }

    public void skipBytes(int i10) {
        setPosition(this.position + i10);
    }

    public String readString(int i10, Charset charset) {
        String str = new String(this.data, this.position, i10, charset);
        this.position += i10;
        return str;
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public ParsableByteArray(int i10) {
        this.data = new byte[i10];
        this.limit = i10;
    }

    public void readBytes(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.data, this.position, bArr, i10, i11);
        this.position += i11;
    }

    public void reset(byte[] bArr, int i10) {
        this.data = bArr;
        this.limit = i10;
        this.position = 0;
    }

    public void readBytes(ByteBuffer byteBuffer, int i10) {
        byteBuffer.put(this.data, this.position, i10);
        this.position += i10;
    }

    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public ParsableByteArray(byte[] bArr, int i10) {
        this.data = bArr;
        this.limit = i10;
    }
}
