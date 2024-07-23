from django.urls import path, include
from rest_framework import routers
from .api import PredictView
 
urlpatterns = [
    path('predict', PredictView.as_view(), name='poetry'),

]