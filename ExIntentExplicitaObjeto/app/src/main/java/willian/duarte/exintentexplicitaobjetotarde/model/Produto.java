package willian.duarte.exintentexplicitaobjetotarde.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Produto implements Parcelable {
    private String nome;
    private double valor;

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nValor: " + valor;
    }

    protected Produto(Parcel in) {
        nome = in.readString();
        valor = in.readDouble();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeDouble(valor);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Produto> CREATOR = new Parcelable.Creator<Produto>() {
        @Override
        public Produto createFromParcel(Parcel in) {
            return new Produto(in);
        }

        @Override
        public Produto[] newArray(int size) {
            return new Produto[size];
        }
    };
}