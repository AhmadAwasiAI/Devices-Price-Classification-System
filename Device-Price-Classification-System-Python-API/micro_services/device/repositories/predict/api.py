from django.shortcuts import get_object_or_404
from rest_framework.response import Response
from rest_framework.views import APIView
from rest_framework import status
import pickle
import os

class PredictView(APIView):
    def post(self, request, format=None):
        data = request.data
        resultList = list(data.values())
        sample_list = [float(number) for number in resultList]

        current_dir = os.path.dirname(os.path.realpath(__file__))
        filename_scaler = os.path.join(current_dir, 'scaler_model.pkl')
        filename_model = os.path.join(current_dir, 'finalized_model.pkl')
        

        loaded_scaler = pickle.load(open(filename_scaler, 'rb'))
        loaded_model = pickle.load(open(filename_model, 'rb'))

        sample_normalize = loaded_scaler.transform([sample_list])
        print("sample_normalize: ",sample_normalize)
        predictions = loaded_model.predict(sample_normalize)

        print("result: ",predictions[0])
        # Here you can process the data as needed
        return Response({"message": "Model has been predict successfully","data":predictions}, status=status.HTTP_200_OK)