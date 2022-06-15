��������� Alfa ��������� get �������: 
{home}/course/gif/{id}
{home}/course/json-gif/{id}
��� {id} - ��� ����������� �������� ������������ ������. 
� ������ ��������� � /gif/ - � ����� ������ ������ �� gif ������.
� ������ ��������� � /json-gif/ - ������� ����� ������ �������� Gif �������, ������� ������ �� ������� GIPHY.

������� ������� � ��������� alfa: 
http://localhost8080/course/gif/BTH
http://localhost8080/course/json-gif/BTH
������ ���� ����� � �� ���������� � ����� currency.md


��������� ���������� Alfa(���� application properties)

-- ���� --
server.port=8080

-- �������� ��������� -- 
gif.service.up-name=gif-service-up

-- ���� --
gif.service.up-gif-app-key=AYvKGn4IoBaKZltiQj8auY55llhbkOi7

-- ����� ��� GET ������� � ����������� --
gif.service.up-url=api.giphy.com/v1/gifs/search?api_key=AYvKGn4IoBaKZltiQj8auY55llhbkOi7&q=rich&limit=1

-- �������� ��������� -- 
gif.service.down-name=gif-service-down

-- ���� --
gif.service.down-gif-app-key=J0DkR56nQnh5hab8zdmM0K86rafi43vB

-- ����� ��� GET ������� � ����������� --
gif.service.down-url=api.giphy.com/v1/gifs/search?api_key=J0DkR56nQnh5hab8zdmM0K86rafi43vB&q=broke&limit=1

-- �������� ��������� --
course.service.name=course-service

-- ����� ��������� --
course.service.url=https://openexchangerates.org/api/

-- ��������� ����� ������ ��� GET ������� c ����������� --
- ��������� �� ���������� ���������� ������� -
course.service.url-get-path-latest=latest

- ��������� � ����������� ������ -
course.service.url-get-path-historical=historical/

- ���������� -
course.service.url-get-path-endformatter=.json

- ���� -
course.service.url-get-path-appID=app_id=YOUR_APP_ID

- ������� ������, ������������ ������� ���� ��������� - 
course.serviced.url-get-path-base-currency=base=USD

-- ������ GET �������, ������� ��������� openexchangerates.org --
#this day course https://openexchangerates.org/api/latest.json?app_id=YOUR_APP_ID&base=USD
#y-day course https://openexchangerates.org/api/historical/2013-02-16.json?app_id=YOUR_APP_ID&base=USD


������������ ������ ��������� alfa - ���� ������ �� gif, ���� ������ �������� ������� Gif.

GIPHY - ��������, � �������� ���������� ����� gif.
������������ ������ - Gif. ���� ������������ ������ �� ��� ��������� �������. 

type: string(default:"gif")    By default, this is almost always GIF.	"gif"
id: string                     This GIF's unique ID                     "YsTs5ltWtEhnq"
slug: string                   The unique slug used in this GIF's URL	"confused-flying-YsTs5ltWtEhnq"
url: string                    The unique URL for this GIF              "http://giphy.com/gifs/confused-flying-YsTs5ltWtEhnq"
bitly_url: string              The unique bit.ly URL for this GIF       "http://gph.is/1gsWDcL"
embed_url: string              A URL used for embedding this GIF        "http://giphy.com/embed/YsTs5ltWtEhnq"
username: string               The username this GIF is attached to, if applicable	"JoeCool4000"
source: string                 The page on which this GIF was found	"http://www.reddit.com/r/reactiongifs/comments/1xpyaa/superman_goes_to_hollywood/"
rating: string                 The MPAA-style rating for this content. Examples include Y, G, PG, PG-13 and R	"g"

��� ���������� �� ������� ����� �������� �����: https://developers.giphy.com/docs/api/schema/#gif-object 


GET ������ � GIPHY � ��������� Alfa ����� ���������: 
api-key (����� ������� � ���������� � ������� ����), 
q ("rich" ��� "broke" � ����������� �� ������� ��� �������� ����� ������������� ������ ������������ ������� �������������), 
limit (=1).
� ������ ��������� ����������� �������� offset ��� ����������� random. 
��������� ��������� - �� ���������. 

GET ��������� GIPHY API:
api_key: ������ (�����������)  YOUR_API_KEY	���� API GIPHY.
q: ������ (�����������)	       cheeseburgers	��������� ������ ��� �����. ���������� @<username> � ����� �����
                                                ��������� q ���������� �������� ��������� ������ �� ����� GIF-������ 
                                                ����������� ������������ (������������ ������ ���� ������������� � 
                                                ����������� ������������� GIPHY.)

                                                ������������ �����: 
                                                50 ��������.
limit: integer (int32)   	20	        ������������ ���������� ������������ ��������. 
                                                (�� ���������: �25�).
                                                ��� ���� ������ ������������ ���������� - 50.
offset: integer (int32)     	5               ������ ��������� ������� �����������.
                                                �� ���������: �0�
                                                ��������: �4999�
rating: string                  g               ��������� ���������� �� ��������� ��������. ���������� �������� �������� g, pg, pg-13, r. ���� �� �� ������� �������, �� �������� ���������� ���� ��������� ���������.
lang: string                    en              ������� ���� �� ��������� ��� ������������� ��������; ����������� 2-��������� ��� ����� ISO 639-1.
random_id: string               -               ������������� / ������ ��� ����������� ������������.
bundle: string  	messaging_non_clips	���������� ������ ������, ��������������� ���������� ������. ��������� � �������.


��� ������� � gif ����� API GIPHY ���������� �����. ���� ����� ���������� �� 100 ��������. 
��� �������� ���������� � ������, ����� ����� ������� �� ����������. 

����� ���������� ��� GIPHY:
alfa - API Key:
AYvKGn4IoBaKZltiQj8auY55llhbkOi7
alfa - second API Key:
J0DkR56nQnh5hab8zdmM0K86rafi43vB

Open Exchange Rates
���� ��������� ������ ���� usd 

//true = up or not changed
//false = down
