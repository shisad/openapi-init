String petId = "petId2";

petsController.getPetbyStatus(petId, new APICallBack<GetPetStatusResponse>() {
    public void onSuccess(HttpContext context, GetPetStatusResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});