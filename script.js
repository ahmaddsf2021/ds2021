
$(function () {
    var code = ""; // Assigning value from model.
    $('#txtPhone').val(code);
    $('#txtPhone').intlTelInput({
        autoHideDialCode: true,
        autoPlaceholder: "ON",
        dropdownContainer: document.body,
        formatOnDisplay: true,
        hiddenInput: "full_number",
        initialCountry: "auto",
        nationalMode: true,
        placeholderNumberType: "MOBILE",
        preferredCountries: ['US'],
        separateDialCode: true
    });
    $('#btnSubmit').on('click', function () {
        var code = $("#txtPhone").intlTelInput("getSelectedCountryData").dialCode;
        var phoneNumber = $('#txtPhone').val();
        var name = $("#txtPhone").intlTelInput("getSelectedCountryData").name;
        alert('Country Code : ' + code + '\nPhone Number : ' + phoneNumber + '\nCountry Name : ' + name);
    });
});
