public String[] getPassport(){
        return Arrays.copyOf(this.passport, this.passport.length);
        // never: return this.passport --> it will change the value if you accidentaly change it.
}
