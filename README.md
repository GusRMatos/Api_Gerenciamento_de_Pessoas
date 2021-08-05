<h1 class="code-line" data-line-start=0 data-line-end=1 ><a id="People_management_api_0"></a>People management api</h1>
<h2 class="code-line" data-line-start=2 data-line-end=3 ><a id="About_2"></a>About</h2>
<h3 class="code-line" data-line-start=3 data-line-end=4 ><a id="People_Management_API_developed_in_the_Santander_bootcamp_3"></a>People Management API developed in the Santander bootcamp</h3>
<h1 class="code-line" data-line-start=5 data-line-end=7 ><a id="GitHub_issueshttpsimgshieldsiogithubissuesGusRMatosApi_Gerenciamento_de_PessoashttpsgithubcomGusRMatosApi_Gerenciamento_de_Pessoasissues_GitHub_forkshttpsimgshieldsiogithubforksGusRMatosApi_Gerenciamento_de_PessoashttpsgithubcomGusRMatosApi_Gerenciamento_de_Pessoasnetwork___GitHub_starshttpsimgshieldsiogithubstarsGusRMatosApi_Gerenciamento_de_PessoashttpsgithubcomGusRMatosApi_Gerenciamento_de_Pessoasstargazers__GitHub_licensehttpsimgshieldsiogithublicenseGusRMatosApi_Gerenciamento_de_PessoashttpsgithubcomGusRMatosApi_Gerenciamento_de_Pessoas_5"></a><a href="https://github.com/GusRMatos/Api_Gerenciamento_de_Pessoas/issues"><img src="https://img.shields.io/github/issues/GusRMatos/Api_Gerenciamento_de_Pessoas" alt="GitHub issues"></a> <a href="https://github.com/GusRMatos/Api_Gerenciamento_de_Pessoas/network"><img src="https://img.shields.io/github/forks/GusRMatos/Api_Gerenciamento_de_Pessoas" alt="GitHub forks"></a>   <a href="https://github.com/GusRMatos/Api_Gerenciamento_de_Pessoas/stargazers"><img src="https://img.shields.io/github/stars/GusRMatos/Api_Gerenciamento_de_Pessoas" alt="GitHub stars"></a>  <a href="https://github.com/GusRMatos/Api_Gerenciamento_de_Pessoas"><img src="https://img.shields.io/github/license/GusRMatos/Api_Gerenciamento_de_Pessoas" alt="GitHub license"></a></h1>
<p class="has-line-data" data-line-start="7" data-line-end="8"><a href="#About">about</a> | <a href="#Requirements">requirements</a> | <a href="#Features">Features</a> | <a href="#tools-used-in-implementation">Tools</a></p>
<h2 class="code-line" data-line-start=8 data-line-end=9 ><a id="Requiriments_8"></a>Requiriments</h2>
<ul>
<li class="has-line-data" data-line-start="9" data-line-end="10">java 11 onwards</li>
<li class="has-line-data" data-line-start="10" data-line-end="11">Spring boot 2.5.3</li>
<li class="has-line-data" data-line-start="11" data-line-end="12">Lombok</li>
<li class="has-line-data" data-line-start="12" data-line-end="13">H2 database or PostgreSQL database</li>
<li class="has-line-data" data-line-start="13" data-line-end="14">Hibernate entitymanager</li>
<li class="has-line-data" data-line-start="14" data-line-end="15">Hibernate envers</li>
<li class="has-line-data" data-line-start="15" data-line-end="16">Hibernate validator</li>
<li class="has-line-data" data-line-start="16" data-line-end="17">Mapstruct 1.4.2.Final</li>
<li class="has-line-data" data-line-start="17" data-line-end="18">Gradle</li>
</ul>
<h2 class="code-line" data-line-start=18 data-line-end=19 ><a id="Features_18"></a>Features</h2>
<ul>
<li class="has-line-data" data-line-start="19" data-line-end="20">People crud</li>
<li class="has-line-data" data-line-start="20" data-line-end="21">Cpf validator</li>
<li class="has-line-data" data-line-start="21" data-line-end="22">Phone Validator</li>
<li class="has-line-data" data-line-start="22" data-line-end="23">PostgreSQL database Connection</li>
<li class="has-line-data" data-line-start="23" data-line-end="25">H2 database connection</li>
</ul>
<h2 class="code-line" data-line-start=25 data-line-end=26 ><a id="Tools_used_in_implementation_25"></a>Tools used in implementation</h2>
<ul>
<li class="has-line-data" data-line-start="26" data-line-end="27">IntelliJ IDEA Community Edition 2021.1.3</li>
<li class="has-line-data" data-line-start="27" data-line-end="28">PostgreSQL</li>
<li class="has-line-data" data-line-start="28" data-line-end="29">Pg admin 4</li>
<li class="has-line-data" data-line-start="29" data-line-end="31">Postman</li>
</ul>
<h2 class="code-line" data-line-start=31 data-line-end=32 ><a id="BuildGradle_31"></a>BuildGradle</h2>
<p class="has-line-data" data-line-start="32" data-line-end="37">plugins {<br>
id ‘org.springframework.boot’ version ‘2.5.3’<br>
id ‘io.spring.dependency-management’ version ‘1.0.11.RELEASE’<br>
id ‘java’<br>
}</p>
<p class="has-line-data" data-line-start="38" data-line-end="41">group = ‘com.Gerenciamento_de_pessoas’<br>
version = ‘0.0.1-SNAPSHOT’<br>
sourceCompatibility = ‘11’</p>
<p class="has-line-data" data-line-start="42" data-line-end="47">configurations {<br>
compileOnly {<br>
extendsFrom annotationProcessor<br>
}<br>
}</p>
<p class="has-line-data" data-line-start="48" data-line-end="51">repositories {<br>
mavenCentral()<br>
}</p>
<p class="has-line-data" data-line-start="52" data-line-end="56">dependencies {<br>
implementation ‘org.springframework.boot:spring-boot-starter-actuator’<br>
implementation ‘org.springframework.boot:spring-boot-starter-data-jpa’<br>
implementation ‘org.springframework.boot:spring-boot-starter-web’</p>
<pre><code>compileOnly 'org.projectlombok:lombok'
developmentOnly 'org.springframework.boot:spring-boot-devtools'

runtimeOnly 'com.h2database:h2'
runtimeOnly 'org.postgresql:postgresql'

annotationProcessor 'org.projectlombok:lombok'
testImplementation 'org.springframework.boot:spring-boot-starter-test'

implementation group: 'org.hibernate', name: 'hibernate-entitymanager', version: '5.2.12.Final'
implementation group: 'org.hibernate', name: 'hibernate-envers'
implementation group: 'org.hibernate', name: 'hibernate-validator', version: '6.1.5.Final'

implementation 'org.mapstruct:mapstruct:1.4.2.Final'
annotationProcessor 'org.mapstruct:mapstruct-processor:1.4.2.Final'
</code></pre>
<p class="has-line-data" data-line-start="72" data-line-end="73">}</p>
<p class="has-line-data" data-line-start="74" data-line-end="77">test {<br>
useJUnitPlatform()<br>
}</p>
<h1 class="code-line" data-line-start=78 data-line-end=79 ><a id="__Spring_Boot_Api__under_development___78"></a>🚧  Spring Boot Api 🚀 under development…  🚧</h1>